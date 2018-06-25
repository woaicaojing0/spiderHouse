package com.spider.service;

import com.spider.bean.MusicComment;
import com.spider.bean.MusicInfo;

import java.util.List;

/**
 * @author cj34920
 * Date: 2018/06/22
 */
public interface MusicService {

    /**
     * 新增歌曲信息
     *
     * @param musicInfo
     * @return
     */
    int addMusicInfo( MusicInfo musicInfo);

    /**
     * 新增歌曲评论
     *
     * @param commentList
     * @return
     */
    int addMusicComment( List<MusicComment> commentList);

}
