package ru.hlynov.xmlexport.search;


//import com.aspose.cells.Cell;
//import com.aspose.cells.Cells;
//import com.aspose.cells.Color;
//import com.aspose.cells.Font;
//import com.aspose.cells.Style;
//import com.aspose.cells.Workbook;
//import com.aspose.cells.Worksheet;
//import com.aspose.cells.WorksheetCollection;

import com.atlassian.jira.issue.search.SearchException;
import com.atlassian.jira.issue.search.SearchRequest;
import com.atlassian.jira.plugin.searchrequestview.AbstractSearchRequestView;
import com.atlassian.jira.plugin.searchrequestview.SearchRequestParams;

//import com.atlassian.jira.bc.issue.search.SearchService;
//import com.atlassian.jira.component.ComponentAccessor;
//import com.atlassian.jira.config.properties.ApplicationProperties;
//import com.atlassian.jira.issue.Issue;
//import com.atlassian.jira.issue.fields.Field;
//import com.atlassian.jira.issue.fields.NavigableField;
//import com.atlassian.jira.issue.fields.layout.column.ColumnLayoutItem;
//import com.atlassian.jira.issue.search.SearchProvider;
//import com.atlassian.jira.issue.search.SearchResults;
//import com.atlassian.jira.issue.views.AbstractSearchRequestIssueTableView;
//import com.atlassian.jira.issue.views.util.SearchRequestViewBodyWriterUtil;
//import com.atlassian.jira.security.JiraAuthenticationContext;
//import com.atlassian.jira.user.ApplicationUser;
//import com.atlassian.jira.util.I18nHelper;
//import com.atlassian.jira.web.bean.PagerFilter;
//import com.atlassian.jira.web.component.ColumnLayoutItemProvider;
//import com.atlassian.query.Query;
//import com.atlassian.sal.api.message.I18nResolver;
//import com.google.gson.Gson;

//import java.io.OutputStream;
import java.io.*;
//import java.text.MessageFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Locale;
//import java.util.Map;
//import java.util.UUID;
//import java.util.function.Consumer;
//import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ru.hlynov.xmlexport.servlet.filter.SearchRequestInterceptor;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleSearchView extends AbstractSearchRequestView {

    private static final Logger log = LoggerFactory.getLogger(SimpleSearchView.class);

    @Override
    public void writeSearchResults(SearchRequest searchRequest, SearchRequestParams searchRequestParams, Writer writer) throws SearchException {

//        HttpServletResponse response = SearchRequestInterceptor.getResponse();
//        HttpServletRequest request = SearchRequestInterceptor.getRequest();
//
//
//
//        String filePath = "/home/alex/123.xlsx";
//        File downloadFile = new File(filePath);
//        try {
//            FileInputStream inStream = new FileInputStream(downloadFile);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        response.setContentType("application/octet-stream");
//        response.setContentLength((int) downloadFile.length());
//
//        response.setHeader("Content-Disposition", "attachment; filename=\"" + downloadFile.getName() + "\"");
//
//        log.warn("attachment; filename=\"" + downloadFile.getName() + "\"");
//
//
//        FileInputStream inStream = null;
//        try {
//            inStream = new FileInputStream(downloadFile);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//
//
//
//        // obtains response's output stream
//        OutputStream outStream = null;
//        try {
//            outStream = response.getOutputStream();
//            byte[] buffer = new byte[4096];
//            int bytesRead = -1;
//
//            while ((bytesRead = inStream.read(buffer)) != -1) {
//                outStream.write(buffer, 0, bytesRead);
//            }
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                inStream.close();
////                outStream.close();
//                outStream.flush();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//
//


//        byte[] finalResult = result.convert(processParams);
//        LOGGER.debug("convert: {}", (Object)(System.currentTimeMillis() - time));
//        time = System.currentTimeMillis();
//        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
//        LOGGER.debug("Writing filename: issues.xlsx");
//        response.addHeader("Content-Disposition", "inline;Filename=issues.xlsx");
//        FileCopyUtils.copy((byte[])finalResult, (OutputStream)response.getOutputStream());




        log.warn("==== logged ===");
        // возврат какого либо файла

    }


}
