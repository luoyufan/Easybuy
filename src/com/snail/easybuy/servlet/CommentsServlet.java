package com.snail.easybuy.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.snail.easybuy.dao.CommentDao;
import com.snail.easybuy.entity.Comment;

public class CommentsServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;


	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String method=request.getParameter("method");
		CommentDao dao=new CommentDao();
		Comment comment=new Comment();

		if("login".equals(method)){
			List<Comment> comments = dao.findAll();
			request.setAttribute("comments", comments);
			request.getRequestDispatcher("WEB-INF/manege/guestbook.jsp").forward(request, response);
		}else if("reply".equals(method)){//点击回复
			request.getRequestDispatcher("WEB-INF/manege/guestbook-modify.jsp").forward(request, response);
		}else if("save".equals(method)){//回复
			dao.saveComment(comment);
			response.sendRedirect(request.getContextPath()+"/CommentsServlet?method=login");
//			request.getRequestDispatcher("CommentsServlet?method=login").forward(request, response);
		}else if("delete".equals(method)){//删除
			String id = request.getParameter("id");
			dao.deleteCommentById(Integer.parseInt(id));
			response.sendRedirect(request.getContextPath()+"/CommentsServlet?method=login");
		}

	}
}