package materials.src.main.java.org.example.course.Model8.entities;

public class Student {
		public String name;
		public double firstTrimester;
		public double secondTrimester;
		public double thirdTrimester;
		
		public double finalDegree() {
			return firstTrimester + secondTrimester + thirdTrimester;
		}
		
		public String aprove() {
			String failed = ("FAILED" + "\n" + "MISSING " + (String.format("%.2f",(60 - finalDegree()))) + " POINTS");
			return (finalDegree()> 59) ? "PASS": failed;
		}
		
		public String toString() {
			return "FINAL GRADE = "
					+ String.format("%.2f", finalDegree());
		}
}
