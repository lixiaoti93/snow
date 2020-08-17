package com.xue.study.snow.view;

import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.Document;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * PDF导出接口
 */
public interface PdfExportSerivce {


    public void make(Map<String,Object> model, Document document,
                     PdfWriter writer, HttpServletRequest request,
                     HttpServletResponse response) ;
}
