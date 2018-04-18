package com.lab_5Mvc.user.services;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckNum
 */
@WebServlet("/CheckNum")
public class CheckNum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckNum() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//先设置验证的宽度和高度。
		int width = 110;
		int height = 25;
		//在内存中创建一个图像对象
		BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		//创建一个画笔
		Graphics g = img.getGraphics();
		
		//给图片增加背景色
		g.setColor(Color.pink);
		g.fillRect(1, 1, width-2, height-2);
		
		//增加边框
		g.setColor(Color.black);
		g.drawRect(0, 0, width, height);//通过填充图片的背景颜色来消除制定的矩形
		
		//图片的文本格式
		g.setColor(Color.blue);
		g.setFont(new Font("宋体",Font.BOLD|Font.ITALIC,15));
		
		//添加文本
		Random rand = new Random();
		int position=20;//设置了数字的间隔
		for(int i= 0;i<4;i++){
			g.drawString(rand.nextInt(10)+"", position, 20);
			position+=20;//避免了数字重叠在一起
		}
		
		//添加6条干扰线
		for(int i=0;i<6;i++){
			g.drawLine(rand.nextInt(width), rand.nextInt(height), rand.nextInt(width), rand.nextInt(height));
		}
		//将图像以流 的方式输出到客户端
		ImageIO.write(img, "jpg", response.getOutputStream());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
