package i377;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Servlet implementation class SessionCount
 */
public class SessionCount extends HttpServlet implements HttpSessionListener {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	/*
	 * public SessionCount() { super(); // TODO Auto-generated constructor stub
	 * }
	 */
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println("count: " + getTotalActiveSession());
	}

	private static int totalActiveSessions;

	@Override
	public void sessionCreated(HttpSessionEvent event) {
		totalActiveSessions++;
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		totalActiveSessions--;
	}

	public static int getTotalActiveSession() {
		return totalActiveSessions;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	/*
	 * protected void doPost(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { // TODO Auto-generated
	 * method stub }
	 */

}
