
export JAVA_HOME=/usr/local/java
export PATH=$JAVA_HOME/bin:$PATH
export CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
export OBJ_NAME=stack-api
export JAVA_OPTS="-server \
-Xmx1G -Xms1G -XX:+DisableExplicitGC \
-verbose:gc \
-XX:+HeapDumpOnOutOfMemoryError \
-XX:+PrintHeapAtGC \
-XX:+PrintTenuringDistribution \
-XX:+PrintGCApplicationStoppedTime \
-XX:+PrintGCTaskTimeStamps \
-XX:+PrintGCDetails \
-XX:+PrintGCDateStamps \
-XX:HeapDumpPath=/data/logs/txstack/dump/heap/ \
-Xloggc:/data/logs/txstack/gc.%t.log \
-Djava.io.tmpdir=/data/tmp/ \
-Dserver.connection-timeout=60000 \
-Dserver.tomcat.accept-count=1000 \
-Dserver.tomcat.max-threads=300 \
-Dserver.tomcat.min-spare-threads=65 \
-Dserver.tomcat.accesslog.enabled=true \
-Dserver.tomcat.accesslog.directory=/data/logs/txstack/ \
-Dserver.tomcat.accesslog.prefix=access_log \
-Dserver.tomcat.accesslog.suffix=.log \
-Dserver.tomcat.accesslog.rotate=true \
-Dserver.tomcat.accesslog.rename-on-rotate=true \
-Dserver.tomcat.accesslog.request-attributes-enabled=true \
-Dserver.tomcat.accesslog.buffered=true \
"

echo " get new code "
cd /usr/local/txstack
git pull

mvn clean install -Pproduct


ID=`ps -ef | grep java | grep $OBJ_NAME | awk '{print $2}'`

echo $ID
echo "---------------"
for id in $ID
do
    kill -9 $id
    echo "killed$id"
done
echo "---------------"


cd /usr/local/txstack/stack-api/target
nohup java -jar $JAVA_OPTS $OBJ_NAME.jar &