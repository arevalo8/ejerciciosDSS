package ejercicio2;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class SingleToolFactory extends AbstractFactoryBean<Knight> {

    private int factoryId;
    private int toolId;

    @Override
    public Class<?> getObjectType() {
        return Knight.class;
    }

    @Override
    protected Knight createInstance() throws Exception {
        return new Tool(toolId);
    }

    public void setFactoryId(int factoryId) {
        this.factoryId = factoryId;
    }

    public void setToolId(int toolId) {
        this.toolId = toolId;
    }
}


