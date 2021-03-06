package com.fkxywl.common.mvc.editor;

import com.fkxywl.common.support.DateHelper;

import java.beans.PropertyEditorSupport;
import java.util.Date;

/**
 * Created by ssr on 2017/3/23.
 */
public class DateEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(DateHelper.parse(text));
    }
    @Override
    public String getAsText() {
        Date value = (Date)getValue();
        return DateHelper.format(value);
    }
}
