package org.acme;

import org.eclipse.microprofile.config.inject.ConfigProperties;

import java.util.Optional;

@ConfigProperties(prefix = "my.quarkus.test")
public class TestConfigProperties {

    private String name;
    private Integer age;
    private Optional<String> nickname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Optional<String> getNickname() {
        return nickname;
    }

    public void setNickname(Optional<String> nickname) {
        this.nickname = nickname;
    }
}
