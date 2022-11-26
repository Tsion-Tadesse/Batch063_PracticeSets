package com.practicepart2.entity;

import jakarta.persistence.*;

//import javax.persistence.Entity;

@Entity
@Table
public class EntityClass {
		@Id
		private int id;
		private String name;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public EntityClass() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public EntityClass(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		@Override
		public String toString() {
			return "EntityClass [id=" + id + ", name=" + name + "]";
		}
		
		
		
	}

