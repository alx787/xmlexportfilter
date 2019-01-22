package ut.ru.hlynov.oit;

import org.junit.Test;
import ru.hlynov.oit.api.MyPluginComponent;
import ru.hlynov.oit.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}