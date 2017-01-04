package com.ldsh.blog.common.util;

import com.octo.captcha.component.image.backgroundgenerator.BackgroundGenerator;
import com.octo.captcha.component.image.backgroundgenerator.FunkyBackgroundGenerator;
import com.octo.captcha.component.image.backgroundgenerator.UniColorBackgroundGenerator;
import com.octo.captcha.component.image.color.RandomListColorGenerator;
import com.octo.captcha.component.image.color.SingleColorGenerator;
import com.octo.captcha.component.image.deformation.ImageDeformation;
import com.octo.captcha.component.image.deformation.ImageDeformationByFilters;
import com.octo.captcha.component.image.fontgenerator.FontGenerator;
import com.octo.captcha.component.image.fontgenerator.RandomFontGenerator;
import com.octo.captcha.component.image.fontgenerator.TwistedRandomFontGenerator;
import com.octo.captcha.component.image.textpaster.DecoratedRandomTextPaster;
import com.octo.captcha.component.image.textpaster.TextPaster;
import com.octo.captcha.component.image.textpaster.textdecorator.BaffleTextDecorator;
import com.octo.captcha.component.image.textpaster.textdecorator.TextDecorator;
import com.octo.captcha.component.image.wordtoimage.ComposedWordToImage;
import com.octo.captcha.component.image.wordtoimage.DeformedComposedWordToImage;
import com.octo.captcha.component.image.wordtoimage.WordToImage;
import com.octo.captcha.component.word.wordgenerator.RandomWordGenerator;
import com.octo.captcha.component.word.wordgenerator.WordGenerator;
import com.octo.captcha.engine.image.ListImageCaptchaEngine;
import com.octo.captcha.image.ImageCaptchaFactory;
import com.octo.captcha.image.gimpy.GimpyFactory;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.awt.image.ImageFilter;

/**
 * Created by Administrator on 2017/1/4.
 */
@Component("com.someabcd.csr.web.crsCaptchaEngine")
public class CSRCaptchaEngine extends ListImageCaptchaEngine {

    @Override
    protected void buildInitialFactories() {
        int minWordLength = 4;
        int maxWordLength = 5;
        int fontSize = 40;
        int imageWidth = 100;
        int imageHeight = 80;
        WordGenerator wordGenerator = new RandomWordGenerator(
                "0123456789abcdefghijklmnopqrstuvwxyz");
        TextPaster randomPaster = new DecoratedRandomTextPaster(minWordLength,
                maxWordLength, new RandomListColorGenerator(new Color[]{
                new Color(23, 170, 27), new Color(220, 34, 11),
                new Color(23, 67, 172)}), new TextDecorator[]{});
        BackgroundGenerator background = new UniColorBackgroundGenerator(
                imageWidth, imageHeight, Color.white);
        FontGenerator font = new RandomFontGenerator(fontSize, fontSize,
                new Font[]{new Font("nyala", Font.BOLD, fontSize),
                        new Font("Bell MT", Font.PLAIN, fontSize),
                        new Font("Credit valley", Font.BOLD, fontSize)});

        ImageDeformation postDef = new ImageDeformationByFilters(
                new ImageFilter[]{});
        ImageDeformation backDef = new ImageDeformationByFilters(
                new ImageFilter[]{});
        ImageDeformation textDef = new ImageDeformationByFilters(
                new ImageFilter[]{});

        WordToImage word2image = new DeformedComposedWordToImage(font,
                background, randomPaster, backDef, textDef, postDef);
        addFactory(new GimpyFactory(wordGenerator, word2image));

//        TextPaster randomPaster = new DecoratedRandomTextPaster(new Integer(8),
//                new Integer(10), new SingleColorGenerator(Color.BLACK),
//                new TextDecorator[]{new BaffleTextDecorator(new Integer(1), Color.WHITE)});
//        //create image captcha factory
//        ImageCaptchaFactory factory = new GimpyFactory(
//                new RandomWordGenerator("0123456789abcdefghijklmnopqrstuvwxyz"),
//                new ComposedWordToImage(new TwistedRandomFontGenerator(new Integer(34),
//                        new Integer(40)), new FunkyBackgroundGenerator(new Integer(
//                        260), new Integer(70)), randomPaster));
//
//        ImageCaptchaFactory characterFactory[] = {factory};
//        addFactories(characterFactory);
    }
}
