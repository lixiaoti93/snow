package com.xue.study.snow.view;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.util.Map;

/**
 * pdf导出视图类
 */
public class PdfView extends AbstractPdfView {
//导出服务接口
    private PdfExportSerivce pdfExportSerivce;

    public PdfView(PdfExportSerivce pdfExportSerivce){
        this.pdfExportSerivce =pdfExportSerivce;

    }

    public PdfView() {
        super();
    }

    @Override
    protected boolean generatesDownloadContent() {
        return super.generatesDownloadContent();
    }

    @Override
    protected Document newDocument() {
        return super.newDocument();
    }

    @Override
    protected PdfWriter newWriter(Document document, OutputStream os) throws DocumentException {
        return super.newWriter(document, os);
    }

    @Override
    protected void prepareWriter(Map<String, Object> model, PdfWriter writer, HttpServletRequest request) throws DocumentException {
        super.prepareWriter(model, writer, request);
    }

    @Override
    protected int getViewerPreferences() {
        return super.getViewerPreferences();
    }

    @Override
    protected void buildPdfMetadata(Map<String, Object> model, Document document, HttpServletRequest request) {
        super.buildPdfMetadata(model, document, request);
    }

    @Override
    protected void buildPdfDocument(Map<String, Object> map, Document document, PdfWriter pdfWriter, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        pdfExportSerivce.make(map,document,pdfWriter,httpServletRequest,httpServletResponse);
    }
}
