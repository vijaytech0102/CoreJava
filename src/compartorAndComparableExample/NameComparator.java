package compartorAndComparableExample;

import java.util.Comparator;

class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) 
	{ 
		// first- second--> ascending order
		// second - first --> descending order
		
		int rlc= s1.roll-s2.roll;
		int ageC= s1.age-s2.age;
		int nmC= s1.name.compareTo(s2.name);
		
		if(ageC!=0)
			return ageC;
		else if(rlc!=0)
			return rlc;
		else
			return nmC;
	}
}
