package com.api.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CollectionRequest {

	/*
	 * {
  "name": "Apple MacBook Pro 16",
  "data": {
    "year": 2019,
    "price": 1849.99,
    "CPU model": "Intel Core i9",
    "Hard disk size": "1 TB"
  }
}
	 * */
	
	    @JsonProperty("name")
		String name;
	    
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Data getData() {
			return data;
		}

		public void setData(Data data) {
			this.data = data;
		}

		@JsonProperty("data")
		Data data;
		
		public static class Data{
			
			@JsonProperty("Price")
			int price;
			
			@JsonProperty("color")
			String color;
			
			@JsonProperty("year")
			int year;
			
			public int getYear() {
				return year;
			}

			public void setYear(int year) {
				this.year = year;
			}

			public String getColor() {
				return color;
			}

			public void setColor(String color) {
				this.color = color;
			}

			public int getPrice() {
				return price;
			}

			public void setPrice(int price) {
				this.price = price;
			}

			public String getCpu_model() {
				return cpu_model;
			}

			public void setCpu_model(String cpu_model) {
				this.cpu_model = cpu_model;
			}

			public String getHd_size() {
				return hd_size;
			}

			public void setHd_size(String hd_size) {
				this.hd_size = hd_size;
			}

			public String getGeneration() {
				return generation;
			}

			public void setGeneration(String generation) {
				this.generation = generation;
			}

			public String getCapacity() {
				return capacity;
			}

			public void setCapacity(String capacity) {
				this.capacity = capacity;
			}

			public int getScreen_size() {
				return screen_size;
			}

			public void setScreen_size(int screen_size) {
				this.screen_size = screen_size;
			}

			@JsonProperty("CPU model")
			String cpu_model;
			
			@JsonProperty("Hard disk size")
			String hd_size;
			
			@JsonProperty("generation")
			String generation;
			
			@JsonProperty("capacity")
			String capacity;
			
			@JsonProperty("Screen size")
			int screen_size;
			
			
		}
}
