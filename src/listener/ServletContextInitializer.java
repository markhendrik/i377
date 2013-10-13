package listener;

import java.io.File;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import datab.SetupDao;

public class ServletContextInitializer implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		SetupDao setupDao = new SetupDao();
		//http://compendium.open.ac.uk/subversion/public/Compendium/Compendium-v1.5.2/src/com/compendium/core/db/management/DBAdminDerbyDatabase.java
		File file = new File(System.getProperty("user.home")+ "/data/markhendrik/db.script");
		if (!file.exists()) {
			setupDao.createSchema();
			setupDao.addTestData();
		}
	}


	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

	}

}