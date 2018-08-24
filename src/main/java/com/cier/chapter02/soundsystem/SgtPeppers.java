package com.cier.chapter02.soundsystem;

import org.springframework.stereotype.Component;

@Component("longlyHeartsClub") // 这个注解表名该类会作为组件类，并告知 Spring 要为这个类创建 bean,括号内表名指定 ID
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
