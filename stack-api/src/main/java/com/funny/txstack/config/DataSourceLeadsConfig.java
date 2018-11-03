package com.funny.txstack.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * 数据源配置工具类
 */
@Configuration
@MapperScan(basePackages = "com.funny.txstack.dao.stat", sqlSessionTemplateRef = "stackSqlSessionTemplate")
public class DataSourceLeadsConfig {
    @Value("${spring.profiles.active}")
    private String profile;

    @Bean(name = "stackDataSource")
    @Qualifier("stackDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.druid.stat")
    public DataSource stackDataSource() {
        return new DruidDataSource();
    }

    @Bean(name = "stackTransactionManager")
    @Qualifier("stackTransactionManager")
    public DataSourceTransactionManager stackTransactionManager(@Qualifier("stackDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "stackSqlSessionFactory")
    @Qualifier("stackSqlSessionFactory")
    public SqlSessionFactory stackSqlSessionFactory(@Qualifier("stackDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mybatis/mapper/stat/*.xml"));
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        if(profile.equalsIgnoreCase("dev")){
            configuration.setLogImpl(StdOutImpl.class);
        }
        return bean.getObject();
    }

    @Bean(name = "stackSqlSessionTemplate")
    @Qualifier("stackSqlSessionTemplate")
    public SqlSessionTemplate stackSqlSessionTemplate(@Qualifier("stackSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
