package co.edu.usbcali.vista;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import co.edu.usbcali.logica.IAvatarLogica;
import co.edu.usbcali.logica.ICourseLanguageLogica;
import co.edu.usbcali.logica.ICourseLogica;
import co.edu.usbcali.logica.ICourseMissionLogica;
import co.edu.usbcali.logica.ILanguageLogica;
import co.edu.usbcali.logica.IMissionLevelLogica;
import co.edu.usbcali.logica.IMissionLogica;
import co.edu.usbcali.logica.IMissionStateLogica;
import co.edu.usbcali.logica.IMissionTypeLogica;
import co.edu.usbcali.logica.INoteLogica;
import co.edu.usbcali.logica.IProgrammingLevelLogica;
import co.edu.usbcali.logica.IRecompenseLogica;
import co.edu.usbcali.logica.IRecompenseStudentLogica;
import co.edu.usbcali.logica.IRolLogica;
import co.edu.usbcali.logica.IRolStudentLogica;
import co.edu.usbcali.logica.IStudenLogica;
import co.edu.usbcali.logica.IStudentLanguageLogica;
import co.edu.usbcali.logica.IStudentMissionHomeworkLogica;
import co.edu.usbcali.logica.IStudentProgrammingLevelLogica;
import co.edu.usbcali.logica.ITeacherLogica;
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


@Scope("singleton")
@Component("delegadoDeNegocio")
public class DelegadoDeNegocio  implements IDelegadoDeNegocio{

	@Autowired
	private IAvatarLogica avatarLogica;
	@Autowired
	private ICourseLogica courseLogica;
	@Autowired
	private ICourseLanguageLogica courseLanguageLogica;
	@Autowired
	private ICourseMissionLogica courseMissionLogica;
	@Autowired
	private ILanguageLogica languageLogica;
	@Autowired
	private IMissionLogica missionLogica;
	@Autowired
	private IMissionLevelLogica missionLevelLogica;
	@Autowired
	private IMissionStateLogica missionStateLogica;
	@Autowired
	private IMissionTypeLogica missionTypeLogica;
	@Autowired
	private INoteLogica noteLogica;
	@Autowired
	private IProgrammingLevelLogica programmingLevelLogica;
	@Autowired
	private IRecompenseLogica recompenseLogica;
	@Autowired
	private IRecompenseStudentLogica recompenseStudentLogica;
	@Autowired
	private IRolLogica rolLogica;
	@Autowired
	private IRolStudentLogica rolStudentLogica;
	@Autowired
	private IStudenLogica studentLogica;
	@Autowired
	private IStudentLanguageLogica studentLanguageLogica;
	@Autowired
	private IStudentMissionHomeworkLogica studentMissionHomeworkLogica;
	@Autowired
	private IStudentProgrammingLevelLogica studentProgrammingLevelLogica;
	@Autowired
	private ITeacherLogica teacherLogica;
	
	@Override
	public void crearAvatar(Avatar entity) throws Exception {
		avatarLogica.crearAvatar(entity);
	}

	@Override
	public void modificarAvatar(Avatar entity) throws Exception {
		avatarLogica.modificarAvatar(entity);
	}

	@Override
	public void eliminarAvatar(Avatar entity) throws Exception {
		avatarLogica.eliminarAvatar(entity);
	}

	@Override
	public Avatar consultarPorIdAvatar(Integer id) throws Exception {
		return avatarLogica.consultarPorIdAvatar(id);
	}

	@Override
	public List<Avatar> consultarTodosLosAvatar() throws Exception {
		return avatarLogica.consultarTodosLosAvatar();
	}

	
	@Override
	public void crearCourseLanguage(CourseLanguage entity) throws Exception {
		courseLanguageLogica.crearCourseLanguage(entity);
	}

	@Override
	public void modificarCourseLanguage(CourseLanguage entity) throws Exception {
		courseLanguageLogica.modificarCourseLanguage(entity);
	}

	@Override
	public void eliminarCourseLanguage(CourseLanguage entity) throws Exception {
		courseLanguageLogica.eliminarCourseLanguage(entity);
	}

	@Override
	public CourseLanguage consultarPorIdCourseLanguage(Integer id) throws Exception {
		return courseLanguageLogica.consultarPorIdCourseLanguage(id);
	}

	@Override
	public List<CourseLanguage> consultarTodoLosCourseLanguage() throws Exception {
		return courseLanguageLogica.consultarTodoLosCourseLanguage();
	}

	
	@Override
	public void crearCourse(Course entity) throws Exception {
		courseLogica.crearCourse(entity);
	}

	@Override
	public void modificarCourse(Course entity) throws Exception {
		courseLogica.modificarCourse(entity);
	}

	@Override
	public void eliminarCourse(Course entity) throws Exception {
		courseLogica.eliminarCourse(entity);
	}

	@Override
	public Course consultarPorId(Integer id) throws Exception {
		return courseLogica.consultarPorId(id);
	}

	@Override
	public List<Course> consultarTodosLosCourse() throws Exception {
		return courseLogica.consultarTodosLosCourse();
	}

	
	@Override
	public void crearCourseMission(CourseMission entity) throws Exception {
		courseMissionLogica.crearCourseMission(entity);
	}

	@Override
	public void modificarCourseMission(CourseMission entity) throws Exception {
		courseMissionLogica.modificarCourseMission(entity);
	}

	@Override
	public void eliminarCourseMission(CourseMission entity) throws Exception {
		courseMissionLogica.eliminarCourseMission(entity);	
	}

	@Override
	public CourseMission consultarPorIdCourseMission(Integer id) throws Exception {
		return courseMissionLogica.consultarPorIdCourseMission(id);
	}

	@Override
	public List<CourseMission> consultarTodosLosCourseMission() throws Exception {
		return courseMissionLogica.consultarTodosLosCourseMission();
	}

	@Override
	public void crearLanguage(Language entity) throws Exception {
		languageLogica.crearLanguage(entity);
	}

	@Override
	public void modificarLanguage(Language entity) throws Exception {
		languageLogica.modificarLanguage(entity);
	}

	@Override
	public void eliminarLanguage(Language entity) throws Exception {
		languageLogica.eliminarLanguage(entity);
	}

	@Override
	public Language consultarPorIdLanguage(Integer id) throws Exception {
		return languageLogica.consultarPorIdLanguage(id);
	}

	@Override
	public List<Language> consultarTodosLosLanguage() throws Exception {
		return languageLogica.consultarTodosLosLanguage();
	}

	
	@Override
	public void crearMissionLevel(MissionLevel entity) throws Exception {
		missionLevelLogica.crearMissionLevel(entity);
	}

	@Override
	public void modificarMissionLevel(MissionLevel entity) throws Exception {
		missionLevelLogica.modificarMissionLevel(entity);
	}

	@Override
	public void eliminarMissionLevel(MissionLevel entity) throws Exception {
		missionLevelLogica.eliminarMissionLevel(entity);
	}

	@Override
	public MissionLevel consultarPorIdMissionLevel(Integer id) throws Exception {
		return missionLevelLogica.consultarPorIdMissionLevel(id);
	}

	@Override
	public List<MissionLevel> consultarTodosPorIdMissionLevel() throws Exception {
		return missionLevelLogica.consultarTodosPorIdMissionLevel();
	}

	@Override
	public void crearMission(Mission entity) throws Exception {
		missionLogica.crearMission(entity);
	}

	@Override
	public void modificarMission(Mission entity) throws Exception {
		missionLogica.modificarMission(entity);
	}

	@Override
	public void eliminarMission(Mission entity) throws Exception {
		missionLogica.eliminarMission(entity);
	}

	@Override
	public Mission consultarPorIdMission(Integer id) throws Exception {
		return missionLogica.consultarPorIdMission(id);
	}

	@Override
	public List<Mission> consultarTodosLosMission() throws Exception {
		return missionLogica.consultarTodosLosMission();
	}

	@Override
	public void crearMissionState(MissionState entity) throws Exception {
		missionStateLogica.crearMissionState(entity);
	}

	@Override
	public void modificarMissionState(MissionState entity) throws Exception {
		missionStateLogica.modificarMissionState(entity);
	}

	@Override
	public void eliminarMissionState(MissionState entity) throws Exception {
		missionStateLogica.eliminarMissionState(entity);
	}

	@Override
	public MissionState consultarPorIdMissionState(Integer id) throws Exception {
		return missionStateLogica.consultarPorIdMissionState(id);
	}

	@Override
	public List<MissionState> consultarTodosLosMissionState() throws Exception {
		return missionStateLogica.consultarTodosLosMissionState();
	}

	
	@Override
	public void crearMissionType(MissionType entity) throws Exception {
		missionTypeLogica.crearMissionType(entity);
	}

	@Override
	public void modificarMissionType(MissionType entity) throws Exception {
		missionTypeLogica.modificarMissionType(entity);
	}

	@Override
	public void eliminarMissionType(MissionType entity) throws Exception {
		missionTypeLogica.eliminarMissionType(entity);
	}

	@Override
	public MissionType consultarPorIdMissionType(Integer id) throws Exception {
		return missionTypeLogica.consultarPorIdMissionType(id);
	}

	@Override
	public List<MissionType> consutarTodosLosMissionType() throws Exception {
		return missionTypeLogica.consutarTodosLosMissionType();
	}

	
	@Override
	public void crearNote(Note entity) throws Exception {
		noteLogica.crearNote(entity);
	}

	@Override
	public void modificarNote(Note entity) throws Exception {
		noteLogica.modificarNote(entity);
	}

	@Override
	public void eliminarNote(Note entity) throws Exception {
		noteLogica.eliminarNote(entity);
	}

	@Override
	public Note consultarPorIdNote(Integer id) throws Exception {
		return noteLogica.consultarPorIdNote(id);
	}

	@Override
	public List<Note> consultarTodosLosNote() throws Exception {
		return noteLogica.consultarTodosLosNote();
	}

	
	@Override
	public void crearProgrammingLevel(ProgrammingLevel entity) throws Exception {
		programmingLevelLogica.crearProgrammingLevel(entity);
	}

	@Override
	public void modificarProgrammingLevel(ProgrammingLevel entity) throws Exception {
		programmingLevelLogica.modificarProgrammingLevel(entity);
	}

	@Override
	public void eliminarProgrammingLevel(ProgrammingLevel entity) throws Exception {
		programmingLevelLogica.eliminarProgrammingLevel(entity);
	}

	@Override
	public ProgrammingLevel consultarPorIdProgrammingLevel(Integer id) throws Exception {
		return programmingLevelLogica.consultarPorIdProgrammingLevel(id);
	}

	@Override
	public List<ProgrammingLevel> consultarTodosLosProgrammingLevel() throws Exception {
		return programmingLevelLogica.consultarTodosLosProgrammingLevel();
	}

	@Override
	public void crearRecompense(Recompense entity) throws Exception {
		recompenseLogica.crearRecompense(entity);
	}

	@Override
	public void modificarRecompense(Recompense entity) throws Exception {
		recompenseLogica.modificarRecompense(entity);
	}

	@Override
	public void eliminarRecompense(Recompense entity) throws Exception {
		recompenseLogica.eliminarRecompense(entity);
	}

	@Override
	public Recompense consultarPorIdRecompense(Integer id) throws Exception {
		return recompenseLogica.consultarPorIdRecompense(id);
	}

	@Override
	public List<Recompense> consultarTodosLosRecompense() throws Exception {
		return recompenseLogica.consultarTodosLosRecompense();
	}

	
	@Override
	public void crearRecompenseStudent(RecompenseStudent entity) throws Exception {
		recompenseStudentLogica.crearRecompenseStudent(entity);
	}

	@Override
	public void modificarRecompenseStudent(RecompenseStudent entity) throws Exception {
		recompenseStudentLogica.modificarRecompenseStudent(entity);
	}

	@Override
	public void eliminarRecompenseStudent(RecompenseStudent entity) throws Exception {
		recompenseStudentLogica.eliminarRecompenseStudent(entity);
	}

	@Override
	public RecompenseStudent consultarPorIdRecompenseStudent(Integer id) throws Exception {
		return recompenseStudentLogica.consultarPorIdRecompenseStudent(id);
	}

	@Override
	public List<RecompenseStudent> consultarTodosLosRecompenseStudent() throws Exception {
		return recompenseStudentLogica.consultarTodosLosRecompenseStudent();
	}

	
	@Override
	public void crearRol(Rol entity) throws Exception {
		rolLogica.crearRol(entity);
	}

	@Override
	public void modificarRol(Rol entity) throws Exception {
		rolLogica.modificarRol(entity);
	}

	@Override
	public void eliminarRol(Rol entity) throws Exception {
		rolLogica.eliminarRol(entity);
	}

	@Override
	public Rol consultarPorIdRol(Integer id) throws Exception {
		return rolLogica.consultarPorIdRol(id);
	}

	@Override
	public List<Rol> consultarTodosLorRol() throws Exception {
		return rolLogica.consultarTodosLorRol();
	}

	
	@Override
	public void crearRolStudent(RolStudent entity) throws Exception {
		rolStudentLogica.crearRolStudent(entity);
	}

	@Override
	public void modificarRolStudent(RolStudent entity) throws Exception {
		rolStudentLogica.modificarRolStudent(entity);
	}

	@Override
	public void eliminarRolStudent(RolStudent entity) throws Exception {
		rolStudentLogica.eliminarRolStudent(entity);
	}

	@Override
	public RolStudent consultarPorIdRolStudent(Integer id) throws Exception {
		return rolStudentLogica.consultarPorIdRolStudent(id);
	}

	@Override
	public List<RolStudent> consultarTodoslosRolStudent() throws Exception {
		return rolStudentLogica.consultarTodoslosRolStudent();
	}

	
	@Override
	public void crearStudent(Student entity) throws Exception {
		studentLogica.crearStudent(entity);
	}

	@Override
	public void modificarStudent(Student entity) throws Exception {
		studentLogica.modificarStudent(entity);
	}

	@Override
	public void eliminarStudent(Student entity) throws Exception {
		studentLogica.eliminarStudent(entity);
	}

	@Override
	public Student consultarPorIdStudent(Integer id) throws Exception {
		return studentLogica.consultarPorIdStudent(id);
	}

	@Override
	public List<Student> consultarTodosLosStudent() throws Exception {
		return studentLogica.consultarTodosLosStudent();
	}

	
	@Override
	public void crearStudentLanguage(StudentLanguage entity) throws Exception {
		studentLanguageLogica.crearStudentLanguage(entity);
	}

	@Override
	public void modificarStudentLanguage(StudentLanguage entity) throws Exception {
		studentLanguageLogica.modificarStudentLanguage(entity);
	}

	@Override
	public void eliminarStudentLanguage(StudentLanguage entity) throws Exception {
		studentLanguageLogica.eliminarStudentLanguage(entity);
	}

	@Override
	public StudentLanguage consultarPorIdStudentLanguage(Integer id) throws Exception {
		return studentLanguageLogica.consultarPorIdStudentLanguage(id);
	}

	@Override
	public List<StudentLanguage> consultarTodosLosStudentLanguage() throws Exception {
		return studentLanguageLogica.consultarTodosLosStudentLanguage();
	}

	
	@Override
	public void crearStudentMissionHomework(StudentMissionHomework entity) throws Exception {
		studentMissionHomeworkLogica.crearStudentMissionHomework(entity);
	}

	@Override
	public void modificarStudentMissionHomework(StudentMissionHomework entity) throws Exception {
		studentMissionHomeworkLogica.modificarStudentMissionHomework(entity);
	}

	@Override
	public void eliminarStudentMissionHomework(StudentMissionHomework entity) throws Exception {
		studentMissionHomeworkLogica.eliminarStudentMissionHomework(entity);
	}

	@Override
	public StudentMissionHomework consultarPorIdStudentMissionHomework(Integer id) throws Exception {
		return studentMissionHomeworkLogica.consultarPorIdStudentMissionHomework(id);
	}

	@Override
	public List<StudentMissionHomework> consultarTodosLosStudentMissionHomework() throws Exception {
		return studentMissionHomeworkLogica.consultarTodosLosStudentMissionHomework();
	}

	
	@Override
	public void crearStudentProgrammingLevel(StudentProgrammingLevel entity) throws Exception {
		studentProgrammingLevelLogica.crearStudentProgrammingLevel(entity);
	}

	@Override
	public void modificarStudentProgrammingLevel(StudentProgrammingLevel entity) throws Exception {
		studentProgrammingLevelLogica.modificarStudentProgrammingLevel(entity);
	}

	@Override
	public void eliminarStudentProgrammingLevel(StudentProgrammingLevel entity) throws Exception {
		studentProgrammingLevelLogica.eliminarStudentProgrammingLevel(entity);
	}

	@Override
	public StudentProgrammingLevel consultarPorIdStudentProgrammingLevel(Integer id) throws Exception {
		return studentProgrammingLevelLogica.consultarPorIdStudentProgrammingLevel(id);
	}

	@Override
	public List<StudentProgrammingLevel> consultarTodoLosStudentProgrammingLevel() throws Exception {
		return studentProgrammingLevelLogica.consultarTodoLosStudentProgrammingLevel();
	}

	@Override
	public void crearTeacher(Teacher entity) throws Exception {
		teacherLogica.crearTeacher(entity);
	}

	@Override
	public void modificarTeacher(Teacher entity) throws Exception {
		teacherLogica.modificarTeacher(entity);
	}

	@Override
	public void eliminarTeacher(Teacher entity) throws Exception {
		teacherLogica.eliminarTeacher(entity);
	}

	@Override
	public Teacher consultarPorIdTeacher(Integer id) throws Exception {
		return teacherLogica.consultarPorIdTeacher(id);
	}

	@Override
	public List<Teacher> consultarTodosLosTeacher() throws Exception {
		return teacherLogica.consultarTodosLosTeacher();
	}

	
	
}
