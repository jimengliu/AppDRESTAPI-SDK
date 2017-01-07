/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.data;

/**
 *
 * @author soloink
 */
public class ImageInfo {
    private String name,fileName,mimeContentRef,deepLink;
    
    public ImageInfo(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getMimeContentRef() {
        return mimeContentRef;
    }

    public void setMimeContentRef(String mimeContentRef) {
        this.mimeContentRef = mimeContentRef;
    }

    public String getDeepLink() {
        return deepLink;
    }

    public void setDeepLink(String deepLink) {
        this.deepLink = deepLink;
    }
  
  
    
}
