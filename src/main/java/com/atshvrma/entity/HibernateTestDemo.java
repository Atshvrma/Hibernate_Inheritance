package com.atshvrma.entity;

import org.hibernate.Session;

public class HibernateTestDemo {

	 /**
	  * @param args
	  */
	 public static void main(String[] args) 
	 {
		   Session session = HIbernateUtil.getSessionFactory().openSession();
	  session.beginTransaction();
	  
	  Vehicle vehicle = new Vehicle();
	  vehicle.setVehicleName("Tesla ");
	  
	  TwoWheeler twoWheeler = new TwoWheeler();
	  twoWheeler.setVehicleName("Automated Bike");
	  twoWheeler.setSteeringTwoWheeler("No Handle");
	  
	  FourWheeler fourWheeler = new FourWheeler();
	  fourWheeler.setVehicleName("Tesla Roadster");
	  fourWheeler.setSteeringFourWheeler("Handle plus automated");
	  
	  session.save(vehicle);
	  session.save(twoWheeler);
	  session.save(fourWheeler);
	  
	  session.getTransaction().commit();
	  session.close();
	 }
	}
