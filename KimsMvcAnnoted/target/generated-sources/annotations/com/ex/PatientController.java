package com.ex;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PatientController {
	@Autowired
	private PatientDao pd;

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String indexPage() {
		return "index";
	}

	@RequestMapping(value = "/patient", method = RequestMethod.GET)
	public ModelAndView patientPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("patient");
		mv.addObject("msg", "welcome");
		return mv;
	}

	@RequestMapping(value = "/patient_register", method = RequestMethod.GET)
	public String patientRegisterPage(Model model) {
		model.addAttribute("register", new PatientBean());
		return "patient_register";
	}

	@RequestMapping(value = "/patient_home", method = RequestMethod.GET)
	public String patientHome() {
		return "patient_home";
	}

	@RequestMapping(value = "/patient_login", method = RequestMethod.GET)
	public String patientLoginPage() {
		return "patient_login";
	}
	
	@RequestMapping(value = "/patient_profile", method = RequestMethod.GET)
	public String patientProfilePage(Model model,@SessionAttribute("patientDetails") PatientBean patient) {
		model.addAttribute("patient", patient);
		return "patient_profile";
	}
	
	@RequestMapping(value = "/update_patient_profile", method = RequestMethod.GET)
	public String patientProfileUpdate(Model model,@SessionAttribute("patientDetails") PatientBean patient) {
		model.addAttribute("patient", patient);
		return "update_patient_profile";
	}
	
	@RequestMapping(value = "/appointment", method = RequestMethod.GET)
	public String appointment(Model model) {
		model.addAttribute("appointment",new AppointmentBean());
		return "appointment";
	}

	@RequestMapping(value = "/add_patient", method = RequestMethod.POST)
	public ModelAndView patientRegister(PatientBean register) {
		boolean status = pd.savePatient(register);
		ModelAndView mv = new ModelAndView();
		if (status) {
			mv.setViewName("patient");
			mv.addObject("msg", "registered Successfully");
		} else {
			mv.setViewName("patient_register");
			mv.addObject("register", new PatientBean());
		}
		return mv;
	}

	@RequestMapping(value = "/plogin", method = RequestMethod.POST)
	public ModelAndView patientLogin(@RequestParam("email") String email, @RequestParam("password") String password,HttpServletRequest request) {
		PatientBean pb = pd.patientLogin(email, password);
		ModelAndView mv = new ModelAndView();
		if (pb == null) {
			mv.setViewName("patient_login");
		} else {
			HttpSession hs=request.getSession();
			hs.setAttribute("patientDetails", pb);
			mv.setViewName("patient_home");
		}
		return mv;
	}
	
	@RequestMapping(value = "/update_patient", method = RequestMethod.POST)
	public ModelAndView patientUpdate(PatientBean patient,HttpServletRequest request) {
		PatientBean pb = pd.updatePatient(patient);
		ModelAndView mv = new ModelAndView();
		if (pb!=null) {
			mv.setViewName("patient_profile");
			mv.addObject("patient", pb);
			HttpSession hs=request.getSession();
			hs.setAttribute("patientDetails", pb);
		} else {
			mv.setViewName("update_patient_profile");
			mv.addObject("patient", patient);
		}
		return mv;
	}
	
	@RequestMapping(value = "/apply_appointment", method = RequestMethod.POST)
	public ModelAndView applyAppointment(AppointmentBean appointment,@SessionAttribute("patientDetails") PatientBean patient) {
		appointment.setPatient(patient);
		boolean status = pd.applyAppointment(appointment);
		ModelAndView mv = new ModelAndView();
		if (status) {
			mv.setViewName("patient_home");
		} else {
			mv.setViewName("appointment");
			mv.addObject("appointment",new AppointmentBean());
		}
		return mv;
	}
	
	@RequestMapping(value = "/appointment_status", method = RequestMethod.GET)
	public ModelAndView appointmentStatus(@SessionAttribute("patientDetails") PatientBean patient) {
		List<AppointmentBean> li = pd.appointmentStatus(patient);
		ModelAndView mv= new ModelAndView();
		mv.setViewName("appointment_status");
		mv.addObject("list", li);
		return mv;
	}
}
