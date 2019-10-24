package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.Beans;
import dmacc.beans.Farm;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.BeanRepository;

@SpringBootApplication
public class ThingsFullOfBeansThatShouldNotBeFullOfBeansApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ThingsFullOfBeansThatShouldNotBeFullOfBeansApplication.class, args);
	}
	
	@Autowired
	BeanRepository repo;

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Beans b = appContext.getBean("beans", Beans.class);
		b.setType("Garbanzo");
		repo.save(b);
		
		Beans s = new Beans("Beets", "red");
		Farm f = new Farm("Schrute Farms", "Honesdale", "PA");
		s.setFarm(f);
		repo.save(s);
		
		List<Beans> allBeans = repo.findAll();
		for (Beans x : allBeans) {
			System.out.println(x.toString());
		}
	}
}
