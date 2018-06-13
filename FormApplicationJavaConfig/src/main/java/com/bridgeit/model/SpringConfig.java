package com.bridgeit.model;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.bridgeit.dao.IUserDAO;
import com.bridgeit.dao.UserDAOImp;
import com.bridgeit.service.IUserService;
import com.bridgeit.service.UserServiceImp;

@EnableWebMvc
@Controller
@ComponentScan(basePackages= {"com.bridgeit.controller"})
public class SpringConfig extends WebMvcConfigurerAdapter{

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver bean=new InternalResourceViewResolver();
		bean.setPrefix("/WEB-INF/view/");
		bean.setSuffix(".jsp");
		return bean;
		
	}
	
	@Bean
	public IUserService userServiceImp() {
		return new UserServiceImp();
	}

	@Bean
	public IUserDAO userDAOImp() {
		return new UserDAOImp();
	}
	@Bean
	public DataSource datasource() {
		 DriverManagerDataSource dataSource = new DriverManagerDataSource();
		 dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		 dataSource.setUrl("jdbc:mysql://localhost:3306/UserSpring");
		 dataSource.setUsername("root");		 
		 dataSource.setPassword("root");
		return dataSource;
		
	}
	@Bean
	public JdbcTemplate jdbctemplate(DataSource dataSource) {
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
	//	jdbcTemplate.setResultsMapCaseInsensitive(true);
		return jdbcTemplate;
		
	}
}
