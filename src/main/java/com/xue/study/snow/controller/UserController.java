package com.xue.study.snow.controller;

import com.lowagie.text.*;
import com.lowagie.text.Font;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.xue.study.snow.service.SelectService;
import com.xue.study.snow.view.PdfExportSerivce;
import com.xue.study.snow.view.PdfView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/queryUser")
public class UserController {
    @Autowired
    private SelectService selectService;
    @RequestMapping(value = "/selectUser", method = RequestMethod.GET)
    public ModelAndView exportPdf(String username) throws Exception {
        if (null == username || username.equals("")) {
            throw new Exception("查询员工账号信息不能为空！！！");
        }
        //查询用户信息
        Map<String, Object> map = new HashMap<>();
        map.put("username", username);
        List<Map<String, Object>> list = selectService.getUserById(map);
        //定义pdf视图
        View view = new PdfView(exportSerivce());
        ModelAndView mv = new ModelAndView();
        mv.addObject("userList", list);
        return mv;
    }

    //导出PDF自定义
    @SuppressWarnings(value = "unchecked")
    private PdfExportSerivce exportSerivce() {
        //使用Lambda 表达式自定义导出
        return (model, document, writer, request, response) -> {
            try {
                //A4纸张
                document.setPageSize(PageSize.A4);
                //标题
                document.addTitle("用户信息");
                //换行
                document.add(new Chunk("\n"));
                //表格，3列
                PdfPTable table = new PdfPTable(3);
                //单元格
                PdfPCell cell = null;
                //字体，定义为蓝色加粗
                Font f8 = new Font();
                f8.setColor(Color.BLUE);
                f8.setStyle(Font.BOLD);
                //标题
                cell = new PdfPCell(new Paragraph("username", f8));
                //居中对齐
                cell.setHorizontalAlignment(1);
                table.addCell(cell);
                //获取用户列表
                List<Map<String, Object>> userlist = (List<Map<String, Object>>) model.get("userList");
                for (Map map : userlist) {
                    document.add(new Chunk("\n"));
                    cell = new PdfPCell(new Paragraph(String.valueOf(map.get("username"))));
                    cell = new PdfPCell(new Paragraph((String.valueOf(map.get("age")))));
                    cell = new PdfPCell(new Paragraph(String.valueOf(map.get("phone"))));
                    table.addCell(cell);

                }
                //文档中加入表格
                document.add(table);

            } catch (DocumentException e) {
                e.printStackTrace();
            }


        };
    }


}
