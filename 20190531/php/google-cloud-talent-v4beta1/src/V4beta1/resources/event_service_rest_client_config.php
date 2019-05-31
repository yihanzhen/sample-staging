<?php

return [
    'interfaces' => [
        'google.cloud.talent.v4beta1.EventService' => [
            'CreateClientEvent' => [
                'method' => 'post',
                'uriTemplate' => '/v4beta1/{parent=projects/*/tenants/*}/clientEvents',
                'body' => '*',
                'additionalBindings' => [
                    [
                        'method' => 'post',
                        'uriTemplate' => '/v4beta1/{parent=projects/*}/clientEvents',
                        'body' => '*',
                    ],
                ],
                'placeholders' => [
                    'parent' => [
                        'getters' => [
                            'getParent',
                        ],
                    ],
                ]
            ],
        ],
    ]
];
