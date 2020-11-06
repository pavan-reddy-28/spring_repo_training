package com.training.task;

public class Bookable {
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Bookable [name=" + name + "]";
		}

		public Bookable(String name) {
			super();
			this.name = name;
		}
		 public Bookable() {
			 this.name="";
		 }
		
}
