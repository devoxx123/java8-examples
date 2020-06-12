package com.java8.streams;

import java.util.Optional;

public class NullPointerExPractise {

	public static void main(String[] args) {
		School school = null;
		/* Old Way java 7 */
		/*if (school != null) {
			String schoolDetails = school.details();
			if (schoolDetails != null) {
				System.out.println(schoolDetails.toLowerCase());
			}
		}*/
		
		/*Java 8  Optional*/
		Optional<School> optionalSchool = Optional.ofNullable(school);
		if (optionalSchool.isPresent()) {
			String optSchool = optionalSchool.get().details();
			Optional<String> optionalSchoolDetails = Optional.ofNullable(optSchool);
			if (optionalSchoolDetails.isPresent()) {
				String schoolDetails = optionalSchoolDetails.get().toLowerCase();
				System.out.println(schoolDetails);
			}else {
				System.out.println("If the Optional object were empty, nothing would be printed.");
			}
		}
		
		/*Java 8 Optional and Functional Interfaces*/		
		/*Optional<String> optionalSchool=Optional.ofNullable(school).map(d->d.details());
		optionalSchool.ifPresent(s->System.out.println(s.toLowerCase()));*/
		
		/*Java 8 Optional and Method Reference*/
		//Optional<String>optSchool=Optional.ofNullable(school).map(School::details);
		//optSchool.ifPresent(System.out::println);

	}
}
