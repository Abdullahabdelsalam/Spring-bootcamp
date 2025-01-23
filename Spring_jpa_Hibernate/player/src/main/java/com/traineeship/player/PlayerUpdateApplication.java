package com.traineeship.player;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayerUpdateApplication {

	public static void main(String[] args, SessionFactory sessionFactory) {
		Session session = sessionFactory.getCurrentSession();
		try {

			session.beginTransaction();


			Player player = session.get(Player.class , 1);


			player.setEmail("shams705@gmail.com");


			session.getTransaction().commit();
		}catch (Exception exception)
		{
			exception.printStackTrace();
		}finally {
			session.close();
		}

	}

}
