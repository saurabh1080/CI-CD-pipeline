package com.pm.githubcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class GithubCicdApplication {

    @GetMapping("/welcome")
    public String Welcome(){
       return "Welcome to CI/CD ";
    }

//    echo "# CI-CD-pipeline" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/saurabh1080/CI-CD-pipeline.git
//    git push -u origin main

    public static void main(String[] args) {
        SpringApplication.run(GithubCicdApplication.class, args);
    }

}
