#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Jul 17 23:22:29 2017

@author: chengyu
"""
import tensorflow as tf 

path='optimized_tfdroid.pb'
tf.reset_default_graph()
with open(path, mode='rb') as f:
    graph_def = tf.GraphDef()
    graph_def.ParseFromString(f.read())
    tf.import_graph_def(graph_def, name='')
#%%
import numpy as np
with tf.Session() as sess:
    I = sess.graph.get_tensor_by_name('I:0')
    O = sess.graph.get_tensor_by_name('O:0')

    ## get and print logits 
    data = np.array(range(6)).reshape(2,3)
    feed_dict = {I:data}
    print(sess.run(O,feed_dict))