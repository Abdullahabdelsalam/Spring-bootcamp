package com.traineeship.player;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayerReadApplication {

	public static void main(String[] args, SessionFactory sessionFactory) {
		Session session = sessionFactory.getCurrentSession();
		try {

			//open the transaction
			session.beginTransaction();

			int id = 1;

			Player player = session.get(Player.class, id);

			//commit the changes
			session.getTransaction().commit();
		}catch (Exception exception)
		{
			exception.printStackTrace();
		}finally {
			session.close();
		}

	}

}
