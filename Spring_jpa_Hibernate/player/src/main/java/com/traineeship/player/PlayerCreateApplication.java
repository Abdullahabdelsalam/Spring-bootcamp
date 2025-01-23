package com.traineeship.player;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayerCreateApplication {

	public static void main(String[] args, SessionFactory sessionFactory) {
		Session session = sessionFactory.getCurrentSession();
		try {

			session.beginTransaction();

			Player player = new Player(1,"abbdullah","shams","abdullah705@gmoil.com");

			session.save(player);

			session.getTransaction().commit();
		}catch (Exception exception)
		{
			exception.printStackTrace();
		}finally {
			session.close();
		}

	}

}
