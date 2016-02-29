package fr.azelart.rest;

import fr.azelart.dto.Instance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * The rest controller.
 */
@RestController
@RequestMapping("/who")
public class Who {

    /**
     * Try to resolve the instance name.
     * @return the instance
     * @throws UnknownHostException if we have a problem when resolving
     */
    @RequestMapping(method = RequestMethod.GET)
    public Instance get() throws UnknownHostException {
        final InetAddress inetAddress = InetAddress.getLocalHost();
        final Instance instance = new Instance(inetAddress.getHostName());
        return instance;
    }
}
