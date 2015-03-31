package net.viotech.jettyservlet;

import android.util.Log;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class JettyServerRunner {

    private Server jettyServer;

    public void start() throws Exception {

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");

        jettyServer = new Server(8080);
        jettyServer.setHandler(context);

        ServletHolder jerseyServlet = context.addServlet(org.glassfish.jersey.servlet.ServletContainer.class, "/*");
        jerseyServlet.setInitOrder(0);
        jerseyServlet.setInitParameter("jersey.config.server.provider.classnames", MyResource.class.getCanonicalName());

        try {
            jettyServer.start();
            Log.d("JettyServer", "Server started");
        } catch (Exception e) {
            Log.d("JettyServer", "Error starting server: " + e.getLocalizedMessage());
        }
    }

    public void stop() throws Exception {
        if (jettyServer != null) {
            jettyServer.stop();
            Log.d("JettyServer", "Server stopped");
        }
    }

}
