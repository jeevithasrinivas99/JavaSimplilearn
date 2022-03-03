package com.mphasis;

public class Admission implements Runnable {

		int seats = 1;

		public static void main(String[] args) {

			Admission ad = new Admission();

			System.out.println("Welcome to Engg admission");
			System.out.println("No of seats  available before " + ad.seats);

			Thread t1 = new Thread(ad); // priority - 5
			t1.setName("satish");

			Thread t2 = new Thread(ad); // priority - 5
			t2.setName("raju");

			t1.start();
			t2.start();

		}

		@Override
		public synchronized void run() {

			if (seats > 0) {
				
				try {
					Thread.sleep(1000);
					
					System.out.println("welcome " + Thread.currentThread().getName());
					System.out.println("Seat is allocated to " + Thread.currentThread().getName());

					seats = seats - 1;

					System.out.println("No of seats after " + seats);
					
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			

			}

			else {

				System.out.println("Sorry try next year " + Thread.currentThread().getName());
			}

		}

	
	}


