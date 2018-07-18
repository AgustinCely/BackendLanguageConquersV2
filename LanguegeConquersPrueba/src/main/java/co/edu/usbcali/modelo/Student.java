package co.edu.usbcali.modelo;
// Generated 15/07/2018 07:41:58 PM by Hibernate Tools 5.1.7.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Student generated by hbm2java
 */
public class Student implements java.io.Serializable {

	private int idStudent;
	private Avatar avatar;
	private Course course;
	private String nameStudent;
	private String lastnameStudent;
	private Character genderStudent;
	private String passwordStudent;
	private Integer scoreStudent;
	private Integer semestreStudent;
	private String nicknameStudent;
	private String emailStudent;
	private Date birthdateStudent;
	private Set studentLanguages = new HashSet(0);
	private Set studentMissionHomeworks = new HashSet(0);
	private Set recompenseStudents = new HashSet(0);
	private Set rolStudents = new HashSet(0);
	private Set studentProgrammingLevels = new HashSet(0);

	public Student() {
	}

	public Student(int idStudent) {
		this.idStudent = idStudent;
	}

	public Student(int idStudent, Avatar avatar, Course course, String nameStudent, String lastnameStudent,
			Character genderStudent, String passwordStudent, Integer scoreStudent, Integer semestreStudent,
			String nicknameStudent, String emailStudent, Date birthdateStudent, Set studentLanguages,
			Set studentMissionHomeworks, Set recompenseStudents, Set rolStudents, Set studentProgrammingLevels) {
		this.idStudent = idStudent;
		this.avatar = avatar;
		this.course = course;
		this.nameStudent = nameStudent;
		this.lastnameStudent = lastnameStudent;
		this.genderStudent = genderStudent;
		this.passwordStudent = passwordStudent;
		this.scoreStudent = scoreStudent;
		this.semestreStudent = semestreStudent;
		this.nicknameStudent = nicknameStudent;
		this.emailStudent = emailStudent;
		this.birthdateStudent = birthdateStudent;
		this.studentLanguages = studentLanguages;
		this.studentMissionHomeworks = studentMissionHomeworks;
		this.recompenseStudents = recompenseStudents;
		this.rolStudents = rolStudents;
		this.studentProgrammingLevels = studentProgrammingLevels;
	}

	public int getIdStudent() {
		return this.idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public Avatar getAvatar() {
		return this.avatar;
	}

	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getNameStudent() {
		return this.nameStudent;
	}

	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}

	public String getLastnameStudent() {
		return this.lastnameStudent;
	}

	public void setLastnameStudent(String lastnameStudent) {
		this.lastnameStudent = lastnameStudent;
	}

	public Character getGenderStudent() {
		return this.genderStudent;
	}

	public void setGenderStudent(Character genderStudent) {
		this.genderStudent = genderStudent;
	}

	public String getPasswordStudent() {
		return this.passwordStudent;
	}

	public void setPasswordStudent(String passwordStudent) {
		this.passwordStudent = passwordStudent;
	}

	public Integer getScoreStudent() {
		return this.scoreStudent;
	}

	public void setScoreStudent(Integer scoreStudent) {
		this.scoreStudent = scoreStudent;
	}

	public Integer getSemestreStudent() {
		return this.semestreStudent;
	}

	public void setSemestreStudent(Integer semestreStudent) {
		this.semestreStudent = semestreStudent;
	}

	public String getNicknameStudent() {
		return this.nicknameStudent;
	}

	public void setNicknameStudent(String nicknameStudent) {
		this.nicknameStudent = nicknameStudent;
	}

	public String getEmailStudent() {
		return this.emailStudent;
	}

	public void setEmailStudent(String emailStudent) {
		this.emailStudent = emailStudent;
	}

	public Date getBirthdateStudent() {
		return this.birthdateStudent;
	}

	public void setBirthdateStudent(Date birthdateStudent) {
		this.birthdateStudent = birthdateStudent;
	}

	public Set getStudentLanguages() {
		return this.studentLanguages;
	}

	public void setStudentLanguages(Set studentLanguages) {
		this.studentLanguages = studentLanguages;
	}

	public Set getStudentMissionHomeworks() {
		return this.studentMissionHomeworks;
	}

	public void setStudentMissionHomeworks(Set studentMissionHomeworks) {
		this.studentMissionHomeworks = studentMissionHomeworks;
	}

	public Set getRecompenseStudents() {
		return this.recompenseStudents;
	}

	public void setRecompenseStudents(Set recompenseStudents) {
		this.recompenseStudents = recompenseStudents;
	}

	public Set getRolStudents() {
		return this.rolStudents;
	}

	public void setRolStudents(Set rolStudents) {
		this.rolStudents = rolStudents;
	}

	public Set getStudentProgrammingLevels() {
		return this.studentProgrammingLevels;
	}

	public void setStudentProgrammingLevels(Set studentProgrammingLevels) {
		this.studentProgrammingLevels = studentProgrammingLevels;
	}

}
