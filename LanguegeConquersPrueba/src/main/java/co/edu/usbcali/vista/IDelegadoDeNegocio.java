package co.edu.usbcali.vista;

import java.util.List;

import co.edu.usbcali.modelo.Avatar;
import co.edu.usbcali.modelo.Course;
import co.edu.usbcali.modelo.CourseLanguage;
import co.edu.usbcali.modelo.CourseMission;
import co.edu.usbcali.modelo.Language;
import co.edu.usbcali.modelo.Mission;
import co.edu.usbcali.modelo.MissionLevel;
import co.edu.usbcali.modelo.MissionState;
import co.edu.usbcali.modelo.MissionType;
import co.edu.usbcali.modelo.Note;
import co.edu.usbcali.modelo.ProgrammingLevel;
import co.edu.usbcali.modelo.Recompense;
import co.edu.usbcali.modelo.RecompenseStudent;
import co.edu.usbcali.modelo.Rol;
import co.edu.usbcali.modelo.RolStudent;
import co.edu.usbcali.modelo.Student;
import co.edu.usbcali.modelo.StudentLanguage;
import co.edu.usbcali.modelo.StudentMissionHomework;
import co.edu.usbcali.modelo.StudentProgrammingLevel;
import co.edu.usbcali.modelo.Teacher;

public interface IDelegadoDeNegocio {

	public void crearAvatar(Avatar entity) throws Exception;
	public void modificarAvatar(Avatar entity) throws Exception;
	public void eliminarAvatar(Avatar entity) throws Exception;
	public Avatar consultarPorIdAvatar(Integer id) throws Exception;
	public List<Avatar> consultarTodosLosAvatar() throws Exception;
	
	public void crearCourseLanguage(CourseLanguage entity) throws Exception;
	public void modificarCourseLanguage(CourseLanguage entity) throws Exception;
	public void eliminarCourseLanguage(CourseLanguage entity) throws Exception;
	public CourseLanguage consultarPorIdCourseLanguage(Integer id) throws Exception;
	public List<CourseLanguage> consultarTodoLosCourseLanguage() throws Exception;
	
	public void crearCourse(Course entity) throws Exception;
	public void modificarCourse(Course entity) throws Exception;
	public void eliminarCourse(Course entity) throws Exception;
	public Course consultarPorId(Integer id) throws Exception;
	public List<Course> consultarTodosLosCourse() throws Exception;
	
	public void crearCourseMission(CourseMission entity) throws Exception;
	public void modificarCourseMission(CourseMission entity) throws Exception;
	public void eliminarCourseMission(CourseMission entity) throws Exception;
	public CourseMission consultarPorIdCourseMission(Integer id) throws Exception;
	public List<CourseMission> consultarTodosLosCourseMission() throws Exception;
	
	public void crearLanguage (Language entity) throws Exception;
	public void modificarLanguage (Language entity) throws Exception;
	public void eliminarLanguage (Language entity) throws Exception;
	public Language consultarPorIdLanguage(Integer id) throws Exception;
	public List<Language> consultarTodosLosLanguage() throws Exception;
	
	public void crearMissionLevel (MissionLevel entity) throws Exception;
	public void modificarMissionLevel(MissionLevel entity) throws Exception;
	public void eliminarMissionLevel(MissionLevel entity) throws Exception;
	public MissionLevel consultarPorIdMissionLevel (Integer id) throws Exception;
	public List<MissionLevel> consultarTodosPorIdMissionLevel() throws Exception;
	
	public void crearMission(Mission entity) throws Exception;
	public void modificarMission(Mission entity) throws Exception;
	public void eliminarMission (Mission entity) throws Exception;
	public Mission consultarPorIdMission(Integer id) throws Exception;
	public List<Mission> consultarTodosLosMission() throws Exception;
	
	public void crearMissionState(MissionState entity) throws Exception;
	public void modificarMissionState(MissionState entity) throws Exception;
	public void eliminarMissionState(MissionState entity) throws Exception;
	public MissionState consultarPorIdMissionState(Integer id) throws Exception;
	public List<MissionState> consultarTodosLosMissionState() throws Exception ;
	
	public void crearMissionType(MissionType entity) throws Exception;
	public void modificarMissionType(MissionType entity) throws Exception;
	public void eliminarMissionType(MissionType entity) throws Exception;
	public MissionType consultarPorIdMissionType(Integer id) throws Exception;
	public List<MissionType> consutarTodosLosMissionType() throws Exception;
	
	public void crearNote(Note entity) throws Exception;
	public void modificarNote(Note entity) throws Exception;
	public void eliminarNote(Note entity) throws Exception;
	public Note consultarPorIdNote(Integer id) throws Exception;
	public List<Note> consultarTodosLosNote() throws Exception;
	
	public void crearProgrammingLevel(ProgrammingLevel entity) throws Exception;
	public void modificarProgrammingLevel(ProgrammingLevel entity) throws Exception;
	public void eliminarProgrammingLevel(ProgrammingLevel entity) throws Exception;
	public ProgrammingLevel consultarPorIdProgrammingLevel(Integer id) throws Exception;
	public List<ProgrammingLevel> consultarTodosLosProgrammingLevel() throws Exception ;
	
	public void crearRecompense(Recompense entity) throws Exception;
	public void modificarRecompense(Recompense entity) throws Exception;
	public void eliminarRecompense(Recompense entity) throws Exception;
	public Recompense consultarPorIdRecompense(Integer id) throws Exception;
	public List<Recompense> consultarTodosLosRecompense() throws Exception;
	
	public void crearRecompenseStudent(RecompenseStudent entity) throws Exception;
	public void modificarRecompenseStudent(RecompenseStudent entity) throws Exception;
	public void eliminarRecompenseStudent(RecompenseStudent entity) throws Exception;
	public RecompenseStudent consultarPorIdRecompenseStudent(Integer id) throws Exception;
	public List<RecompenseStudent> consultarTodosLosRecompenseStudent() throws Exception;
	
	public void crearRol(Rol entity) throws Exception;
	public void modificarRol(Rol entity) throws Exception;
	public void eliminarRol(Rol entity) throws Exception;
	public Rol consultarPorIdRol(Integer id) throws Exception;
	public List<Rol> consultarTodosLorRol() throws Exception;
	
	public void crearRolStudent(RolStudent entity) throws Exception;
	public void modificarRolStudent(RolStudent entity) throws Exception;
	public void eliminarRolStudent(RolStudent entity) throws Exception;
	public RolStudent consultarPorIdRolStudent(Integer id) throws Exception;
	public List<RolStudent> consultarTodoslosRolStudent() throws Exception;
	
	public void crearStudent(Student entity) throws Exception;
	public void modificarStudent(Student entity) throws Exception;
	public void eliminarStudent(Student entity) throws Exception;
	public Student consultarPorIdStudent(Integer id) throws Exception;
	public List<Student> consultarTodosLosStudent() throws Exception;
	
	public void crearStudentLanguage(StudentLanguage entity) throws Exception;
	public void modificarStudentLanguage(StudentLanguage entity) throws Exception;
	public void eliminarStudentLanguage(StudentLanguage entity) throws Exception;
	public StudentLanguage consultarPorIdStudentLanguage(Integer id) throws Exception;
	public List<StudentLanguage> consultarTodosLosStudentLanguage() throws Exception;
	
	public void crearStudentMissionHomework(StudentMissionHomework entity) throws Exception;
	public void modificarStudentMissionHomework(StudentMissionHomework entity) throws Exception;
	public void eliminarStudentMissionHomework(StudentMissionHomework entity) throws Exception;
	public StudentMissionHomework consultarPorIdStudentMissionHomework(Integer id) throws Exception;
	public List<StudentMissionHomework> consultarTodosLosStudentMissionHomework() throws Exception;
	
	public void crearStudentProgrammingLevel(StudentProgrammingLevel entity) throws Exception;
	public void modificarStudentProgrammingLevel(StudentProgrammingLevel entity) throws Exception;
	public void eliminarStudentProgrammingLevel(StudentProgrammingLevel entity) throws Exception;
	public StudentProgrammingLevel consultarPorIdStudentProgrammingLevel(Integer id) throws Exception;
	public List<StudentProgrammingLevel> consultarTodoLosStudentProgrammingLevel() throws Exception;
	
	public void crearTeacher(Teacher entity) throws Exception;
	public void modificarTeacher(Teacher entity) throws Exception;
	public void eliminarTeacher(Teacher entity)throws Exception;
	public Teacher consultarPorIdTeacher(Integer id)throws Exception;
	public List<Teacher> consultarTodosLosTeacher() throws Exception;
	
}
