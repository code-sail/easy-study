package com.Alvin.easystudy.model.dto.questionBankQuestion;

import com.Alvin.easystudy.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * 移除题目题库关系请求
 */

@Data
public class QuestionBankQuestionRemoveRequest implements Serializable{


    /**
     * 题库 id
     */
    private Long questionBankId;

    /**
     * 题目 id
     */
    private Long questionId;



    private static final long serialVersionUID = 1L;
}