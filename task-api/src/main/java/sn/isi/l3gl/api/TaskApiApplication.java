package sn.isi.l3gl.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"sn.isi.l3gl.api", "sn.isi.l3gl.core"})
@EntityScan(basePackages = "sn.isi.l3gl.core.entity")
@EnableJpaRepositories(basePackages = "sn.isi.l3gl.core.repository")
public class TaskApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskApiApplication.class, args);
    }
}
