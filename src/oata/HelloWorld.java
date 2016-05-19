package oata;

import org.apache.log4j.Logger;
/**
 * Created by jjohnson on 5/18/2016.
 */
public class HelloWorld {

    static Logger logger = Logger.getLogger(HelloWorld.class);

    public static void main(String[] args) {

        // BasicConfigurator.configure();
        logger.info("Hello World");     // the old SysO-statement
    }
}
