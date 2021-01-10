package com.realtor;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.pojo.Plot;

@MultipartConfig(fileSizeThreshold = 1024*1024*2,maxFileSize = 1024*1024*10,maxRequestSize = 1024*1024*50)
public class AddPlot extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		Part part=request.getPart("file");
		String fileName = FileUpload.getFileNames(part);
		String savePath ="F:\\git\\Training-AkhilChanda\\RelatorPro\\WebContent\\images"+File.separator+fileName;
		File fileSaveDir =new File(savePath);
		part.write(savePath+File.separator);
		Plot p=new Plot();
		p.setPlotNo(request.getParameter("plotNo"));
		p.setOwnerName(request.getParameter("ownerName"));
		p.setEmail(request.getParameter("email"));
		p.setPhone(request.getParameter("phone"));
		int amount=Integer.parseInt(request.getParameter("amount"));
		p.setAmount(amount);
		p.setVenture(request.getParameter("venture"));
		p.setAddress(request.getParameter("address"));
		p.setStatus("vacant");
		p.setArea(request.getParameter("area")+" sqft");
		p.setFilename(fileName);
		boolean status=false;
		status=AddPlotBean.add(p);
		if(status) {
			response.sendRedirect("./admin_home.jsp?msg=added sucessfully");
		}
		else
			response.sendRedirect("./add_plot.jsp?msg=added failed");
		
	}

}
