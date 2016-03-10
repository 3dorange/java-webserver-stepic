package resourceServer;

import resources.TestResource;

/**
 * Created by nikitaborodulin on 10/03/16.
 */
public class ResourceServerController implements ResourceServerControllerMBean{
    private final ResourceServer resourceServer;

    public ResourceServerController(ResourceServer resourceServer) {
        this.resourceServer = resourceServer;
    }

    @Override
    public int getAge() {
        return resourceServer.getTestResource().getAge();
    }

    @Override
    public String getName() {
        return resourceServer.getTestResource().getName();
    }
}
