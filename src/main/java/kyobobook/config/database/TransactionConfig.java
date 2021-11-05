/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com           2021. 8. 12.  First Draft.
 *
 ****************************************************/
package kyobobook.config.database;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.interceptor.DefaultTransactionAttribute;
import org.springframework.transaction.interceptor.RollbackRuleAttribute;
import org.springframework.transaction.interceptor.RuleBasedTransactionAttribute;
import org.springframework.transaction.interceptor.TransactionInterceptor;

/**
 * @Project     : fo-order-api
 * @FileName    : TransactionConfig.java
 * @Date        : 2021. 8. 12.
 * @author      : smlee1@kyobobook.com
 * @description : DataBase 의 트랜잭션 설정
 */
@Aspect
@Configuration
@EnableAspectJAutoProxy
public class TransactionConfig {
    
    private static final String AOP_POINTCUT_EXPRESSION = "execution(* kyobobook..service..*(..))";
    
    @Autowired
    private PlatformTransactionManager transactionManager;
    
    /**
     * @Method      : txAdvice
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : Transaction 처리되어야 할 메소드 명 지정.
     *                txAttributes 에 추가된 이름으로 시작하는 method 들은 동일한 트랜잭션 처리
     * @return
     */
    @Bean
    public TransactionInterceptor txAdvice() {
        TransactionInterceptor txAdvice = new TransactionInterceptor();
        
        List<RollbackRuleAttribute> rollbackRules = new ArrayList<>();
        rollbackRules.add(new RollbackRuleAttribute(Exception.class));
        DefaultTransactionAttribute attribute = new RuleBasedTransactionAttribute(TransactionDefinition.PROPAGATION_REQUIRED, rollbackRules);
        String transactionAttributesDefinition = attribute.toString();
        
        Properties txAttributes = new Properties();
        txAttributes.setProperty("insert*", transactionAttributesDefinition);
        txAttributes.setProperty("update*", transactionAttributesDefinition);
        txAttributes.setProperty("delete*", transactionAttributesDefinition);
        txAttributes.setProperty("useTx*", transactionAttributesDefinition);
        
        txAdvice.setTransactionAttributes(txAttributes);
        txAdvice.setTransactionManager(transactionManager);
        
        return txAdvice; 
  }

    /**
     * @Method      : txAdviceAdvisor
     * @Date        : 2021. 8. 12.
     * @author      : smlee1@kyobobook.com
     * @description : AOP POINTCUT 설정
     * @return
     */
    @Bean
    public Advisor txAdviceAdvisor() {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression(AOP_POINTCUT_EXPRESSION);
        return new DefaultPointcutAdvisor(pointcut, txAdvice());
    }
}
