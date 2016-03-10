package resourceServer;

import resources.TestResource;

/**
 * Created by nikitaborodulin on 10/03/16.
 */
public class ResourceServer {
    private TestResource testResource;

    public TestResource getTestResource() {
        return testResource;
    }

    public void setTestResource(TestResource testResource) {
        this.testResource = testResource;
    }
}
