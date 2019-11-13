package com.poznan.sds.project.agreement.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long courseId;
	private Long courseCode;
	private String courseName;
	private String description;
	// just email of a responsible professor for the given course..
	private String emailOfCourseSupervisor;
	private String studyCycle;
	private int numOfECTS;
	private List<StudentComment> comments;
	// number of hours in lecture/lab/project such as... 60/0/30 --> later parsed
	// over "/" and extracted like that,easier than making an extra class..
	private String numOfHours;
	// semester in which it is given, can be autumn/spring
	private String semester;

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public Long getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(Long courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmailOfCourseSupervisor() {
		return emailOfCourseSupervisor;
	}

	public void setEmailOfCourseSupervisor(String emailOfCourseSupervisor) {
		this.emailOfCourseSupervisor = emailOfCourseSupervisor;
	}

	public String getStudyCycle() {
		return studyCycle;
	}

	public void setStudyCycle(String studyCycle) {
		this.studyCycle = studyCycle;
	}

	public int getNumOfECTS() {
		return numOfECTS;
	}

	public void setNumOfECTS(int numOfECTS) {
		this.numOfECTS = numOfECTS;
	}

	public String getNumOfHours() {
		return numOfHours;
	}

	public void setNumOfHours(String numOfHours) {
		this.numOfHours = numOfHours;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseCode == null) ? 0 : courseCode.hashCode());
		result = prime * result + ((courseId == null) ? 0 : courseId.hashCode());
		result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((emailOfCourseSupervisor == null) ? 0 : emailOfCourseSupervisor.hashCode());
		result = prime * result + ((studyCycle == null) ? 0 : studyCycle.hashCode());
		result = prime * result + numOfECTS;
		result = prime * result + ((numOfHours == null) ? 0 : numOfHours.hashCode());
		result = prime * result + ((semester == null) ? 0 : semester.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (courseCode == null) {
			if (other.courseCode != null)
				return false;
		} else if (!courseCode.equals(other.courseCode))
			return false;
		if (courseId == null) {
			if (other.courseId != null)
				return false;
		} else if (!courseId.equals(other.courseId))
			return false;
		if (courseName == null) {
			if (other.courseName != null)
				return false;
		} else if (!courseName.equals(other.courseName))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (emailOfCourseSupervisor == null) {
			if (other.emailOfCourseSupervisor != null)
				return false;
		} else if (!emailOfCourseSupervisor.equals(other.emailOfCourseSupervisor))
			return false;
		if (studyCycle == null) {
			if (other.studyCycle != null)
				return false;
		} else if (!studyCycle.equals(other.studyCycle))
			return false;
		if (numOfECTS != other.numOfECTS)
			return false;
		if (numOfHours == null) {
			if (other.numOfHours != null)
				return false;
		} else if (!numOfHours.equals(other.numOfHours))
			return false;
		if (semester == null) {
			if (other.semester != null)
				return false;
		} else if (!semester.equals(other.semester))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseCode=" + courseCode + ", courseName=" + courseName
				+ ", description=" + description + ", emailOfCourseSupervisor=" + emailOfCourseSupervisor
				+ ", studyCycle=" + studyCycle + ", numOfECTS=" + numOfECTS + ", numOfHours=" + numOfHours
				+ ", semester=" + semester + "]";
	}

}
