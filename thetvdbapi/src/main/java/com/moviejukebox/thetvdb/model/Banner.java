/*
 *      Copyright (c) 2004-2011 YAMJ Members
 *      http://code.google.com/p/moviejukebox/people/list 
 *  
 *      Web: http://code.google.com/p/moviejukebox/
 *  
 *      This software is licensed under a Creative Commons License
 *      See this page: http://code.google.com/p/moviejukebox/wiki/License
 *  
 *      For any reuse or distribution, you must make clear to others the 
 *      license terms of this work.  
 */
package com.moviejukebox.thetvdb.model;

/**
 *
 * @author altman.matthew
 */
public class Banner {

    public static final String TYPE_SERIES = "series";
    public static final String TYPE_SEASON = "season";
    public static final String TYPE_POSTER = "poster";
    public static final String TYPE_FANART = "fanart";
    
    private String url;
    private String vignette;
    private String thumb;
    private String language;
    private int season = 0;
    private String bannerType;
    private String bannerType2;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVignette() {
        return vignette;
    }

    public void setVignette(String vignette) {
        this.vignette = vignette;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }
    
    public void setSeason(String season) {
        try {
            this.season = Integer.parseInt(season);
        } catch (Exception error) {
            this.season = 0;
        }
    }

    public String getBannerType() {
        return bannerType;
    }

    public void setBannerType(String bannerType) {
        this.bannerType = bannerType;
    }

    public String getBannerType2() {
        return bannerType2;
    }

    public void setBannerType2(String bannerType2) {
        this.bannerType2 = bannerType2;
    }
    
}