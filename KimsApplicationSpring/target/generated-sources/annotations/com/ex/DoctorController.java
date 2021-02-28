package com.ex;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DoctorController {
	@Autowired
	private DoctorDao dd;

	@RequestMapping(value = "/doctor", method = RequestMethod.GET)
	public ModelAndView doctorPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("doctor");
		mv.addObject("msg", "welcome");
		return mv;
	}

	@RequestMapping(value = "/doctor_register", method = RequestMethod.GET)
	public String doctorRegisterPage(Model model) {
		model.addAttribute("dregister", new DoctorBean());
		return "doctor_register";
	}

	@RequestMapping(value = "/doctor_home", method = RequestMethod.GET)
	public String doctorHome() {
		return "doctor_home";
	}

	@RequestMapping(value = "/doctor_login", method = RequestMethod.GET)
	public String doctorLoginPage() {
		return "doctor_login";
	}
	
	@RequestMapping(value = "/doctor_profile", method = RequestMethod.GET)
	public String patientProfilePage(Model model,@SessionAttribute("doctorDetails") DoctorBean doctor) {
		model.addAttribute("doctor", doctor);
		return "doctor_profile";
	}
	
	@RequestMapping(value = "/update_doctor_profile", method = RequestMethod.GET)
	public String patientProfileUpdate(Model model,@SessionAttribute("doctorDetails") DoctorBean doctor) {
		model.addAttribute("doctor", doctor);
		return "update_doctor_profile";
	}

	@RequestMapping(value = "/add_doctor", method = RequestMethod.POST)
	public ModelAndView patientRegister(DoctorBean dregister) {
		boolean status = dd.saveDoctor(dregister);
		ModelAndView mv = new ModelAndView();
		if (status) {
			mv.setViewName("doctor");
			mv.addObject("msg", "registered Successfully");
		} else {
			mv.setViewName("doctor_register");
			mv.addObject("dregister", new DoctorBean());
		}
		return mv;
	}

	@RequestMapping(value = "/dlogin", method = RequestMethod.POST)
	public ModelAndView doctorLogin(@RequestParam("email") String email, @RequestParam("password") String password,HttpServletRequest request) {
		DoctorBean db = dd.doctorLogin(email, password);
		ModelAndView mv = new ModelAndView();
		if (db == null) {
			mv.setViewName("doctor_login");
		} else {
			HttpSession hs=request.getSession();
			hs.setAttribute("doctorDetails", db);
			hs.setAttribute("specialization", db.getSpecialization());
			hs.setAttribute("dname", db.getDname());
			mv.setViewName("doctor_home");
		}
		return mv;
	}
	
	@RequestMapping(value = "/doctor_update", method = RequestMethod.POST)
	public ModelAndView doctorUpdate(DoctorBean doctor,HttpServletRequest request) {
		DoctorBean db = dd.updateDoctor(doctor);
		ModelAndView mv = new ModelAndView();
		if (db!=null) {
			mv.setViewName("doctor_profile");
			mv.addObject("doctor", db);
			HttpSession hs=request.getSession();
			hs.setAttribute("doctorDetails", db);
		} else {
			mv.setViewName("update_doctor_profile");
			mv.addObject("doctor", doctor);
		}
		return mv;
	}
	
	@RequestMapping(value = "/view_appointment", method = RequestMethod.GET)
	public ModelAndView appointmentView(@SessionAttribute("specialization") String specialization) {
		List<AppointmentBean> li = dd.appointments(specialization);
		ModelAndView mv= new ModelAndView();
		mv.setViewName("view_appointment");
		mv.addObject("vlist", li);
		return mv;
	}
	
	@RequestMapping(value = "/accept/{id}", method = RequestMethod.GET)
	public ModelAndView acceptAppointment(@SessionAttribute("dname") String dname,@PathVariable("id") int id,@SessionAttribute("specialization") String specialization) {
		dd.acceptAppointment(dname, id);
		List<AppointmentBean> li = dd.appointments(specialization);
		ModelAndView mv= new ModelAndView();
		mv.setViewName("view_appointment");
		mv.addObject("vlist", li);
		return mv;
	}
}
