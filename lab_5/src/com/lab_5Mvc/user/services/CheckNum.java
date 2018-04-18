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
		//��������֤�Ŀ�Ⱥ͸߶ȡ�
		int width = 110;
		int height = 25;
		//���ڴ��д���һ��ͼ�����
		BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		//����һ������
		Graphics g = img.getGraphics();
		
		//��ͼƬ���ӱ���ɫ
		g.setColor(Color.pink);
		g.fillRect(1, 1, width-2, height-2);
		
		//���ӱ߿�
		g.setColor(Color.black);
		g.drawRect(0, 0, width, height);//ͨ�����ͼƬ�ı�����ɫ�������ƶ��ľ���
		
		//ͼƬ���ı���ʽ
		g.setColor(Color.blue);
		g.setFont(new Font("����",Font.BOLD|Font.ITALIC,15));
		
		//����ı�
		Random rand = new Random();
		int position=20;//���������ֵļ��
		for(int i= 0;i<4;i++){
			g.drawString(rand.nextInt(10)+"", position, 20);
			position+=20;//�����������ص���һ��
		}
		
		//���6��������
		for(int i=0;i<6;i++){
			g.drawLine(rand.nextInt(width), rand.nextInt(height), rand.nextInt(width), rand.nextInt(height));
		}
		//��ͼ������ �ķ�ʽ������ͻ���
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
