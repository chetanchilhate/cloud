package com.cj.googlejib;

import io.dekorate.docker.annotation.DockerBuild;
import io.dekorate.kubernetes.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@KubernetesApplication(
		replicas = 3,
		ports = @Port(name = "http", containerPort = 8080),
		labels = @Label(key = "version", value = "v1")
)
@DockerBuild(group = "chetanchilhate")
public class GoogleJibApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleJibApplication.class, args);
	}

}
