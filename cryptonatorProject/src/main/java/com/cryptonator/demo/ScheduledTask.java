package com.cryptonator.demo;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTask {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTask.class);

    //private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 3500)
    public void newContainer(){
        RestTemplate restTemplate = new RestTemplate();
        Container container = restTemplate.getForObject(
                "https://api.cryptonator.com/api/full/btc-usd", Container.class);

        log.info("Info is" + container.toString());
    }
}


