package com.sda.service;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WriterService {


    private WriterService writerService;

    @Before
    public void init() {
        this.writerService = new WriterService();
    }

    @Test
    public void testOneName() {
        //given
        WriterService writerService = new WriterService();
        String name = "Szymon";

        //when
        String result = writerService.write(name);


        //then
        Assert.assertEquals("Hello, Szymon.", result);
    }

    @Test
    public void testNullName() {
        //given
        String name = null;
        //when
        String result = writerService.write(name);
        //then
        Assert.assertEquals("Hello, my friend.", result);

    }

    @Test
    public void testBlankName() {
        //given
        String name = "";

        //when
        String result = writerService.write(name);

        //then
        Assert.assertEquals("Hello, my friend", result);
    }

    public void testCapitalizeName() {
        //given
        String name = "SZYMON";

        //when
        String result = writerService.write(name);

        //then
        Assert.assertEquals("HELLO, SZYMON!", result);
    }
}
