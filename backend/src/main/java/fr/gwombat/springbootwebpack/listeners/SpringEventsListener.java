package fr.gwombat.springbootwebpack.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SpringEventsListener {

    private static final Logger logger = LoggerFactory.getLogger(SpringEventsListener.class);

    @EventListener
    public void handleContextStartedEvent(ContextStartedEvent event) {
        logger.info("Spring context successfully started!!!");
    }

    @EventListener
    public void handleContextRefreshedEvent(ContextRefreshedEvent event) {
        logger.info("Spring context refreshed!");
    }
}
